package aa.slkdatabase.practice.domain;


import lombok.Data;

@Data
public class StudentScore {
    private Integer id;
    private Integer sid;
    private String gender;
    private String sSubject;
    private Integer sScore;
}
