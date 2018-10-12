package test;
import framework.Helpers;
import org.testng.annotations.Test;



public class Tests extends Helpers {

    @Test
    public void CreateNewEvent() {
        selectAdd();
        setTitle();
        selectLocation();
        selectCurrentLocation();
        setNotes();
        selectAdd();
    }

    @Test
    public void JumpToDecember() {
        jumpToDecember();
    }

    @Test
    public void addCalendars() {
        addHideCalendars();
    }

}
