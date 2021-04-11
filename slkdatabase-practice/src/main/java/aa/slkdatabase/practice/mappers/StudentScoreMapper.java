package aa.slkdatabase.practice.mappers;

import aa.slkdatabase.practice.domain.StudentScore;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentScoreMapper {



    @Insert({
            "<script>",
            "select sid,gender,",
            "max(case when s_subject='语' then s_score else 0 end) as '语文' ,",
            "max(case when s_subject='数' then s_score else 0 end) as '数学' ,",
            "max(case when s_subject='外' then s_score else 0 end) as '英语'\t",
            "from student_score GROUP BY sid,gender;",
            "</script>"
    })
    void rowColumnSwitch(@Param("studentScoreList") List<StudentScore> studentScoreList);
}
