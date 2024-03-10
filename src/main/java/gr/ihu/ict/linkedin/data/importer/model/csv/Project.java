package gr.ihu.ict.linkedin.data.importer.model.csv;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class Project {
    private String Title;
    private String Description;
    private String Url;
    private Date StartedOn;
    private Date FinishedOn;
}
