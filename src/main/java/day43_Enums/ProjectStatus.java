package day43_Enums;

public enum ProjectStatus {

    OPEN, CLOSED, PROGRESS("IN PROGRESS");

    String status;

    ProjectStatus(String status) {  // allows us to change how an Enum will print in console
        this.status = status;       // ^^ PROGRESS("IN PROGRESS");
    }
    ProjectStatus() {   // Empty constructor used to allow for other Enums
                        // to be used without requiring parameters
    }
}
