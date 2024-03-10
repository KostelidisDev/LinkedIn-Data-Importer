package gr.ihu.ict.linkedin.data.importer.model.csv;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class Profile {
    private String FirstName;
    private String LastName;
    private String MaidenName;
    private String Address;
    private Date BirthDate;
    private String Headline;
    private String Summary;
    private String Industry;
    private String ZipCode;
    private String GeoLocation;
    private String TwitterHandles;
    private String Websites;
    private String InstantMessengers;
}
