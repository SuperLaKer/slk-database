package aa.slktop.database.explain;

import lombok.Data;

@Data
public class FilmActor {

    private Integer id;
    private Integer filmId;
    private Integer actorId;
    private String remark;

}
