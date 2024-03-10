package gr.ihu.ict.linkedin.data.importer.model.csv;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class Publication {
    private String Name;
    private Date PublishedOn;
    private String Description;
    private String Publisher;
    private String Url;
}
