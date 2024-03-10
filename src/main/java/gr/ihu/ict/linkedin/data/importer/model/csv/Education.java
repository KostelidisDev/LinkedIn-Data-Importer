package gr.ihu.ict.linkedin.data.importer.model.csv;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class Education {
    private String SchoolName;
    private Date StartDate;
    private Date EndDate;
    private String Notes;
    private String DegreeName;
    private String Activities;
}
