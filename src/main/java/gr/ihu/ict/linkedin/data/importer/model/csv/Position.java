package gr.ihu.ict.linkedin.data.importer.model.csv;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class Position {
    private String CompanyName;
    private String Title;
    private String Description;
    private String Location;
    private Date StartedOn;
    private Date FinishedOn;
}
