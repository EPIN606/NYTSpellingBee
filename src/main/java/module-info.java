module cs380.NYTSpellingBee {
    requires javafx.controls;
    requires javafx.fxml;
	requires junit;

    opens cs380.NYTSpellingBee to javafx.fxml;
    exports cs380.NYTSpellingBee;
}
