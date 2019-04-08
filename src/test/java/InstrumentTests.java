import org.junit.Before;

import java.util.ArrayList;

public class InstrumentTests {

    Guitar guitar;
    GuitarString guitarString1;
    GuitarString guitarString2;
    GuitarString guitarString3;
    GuitarString guitarString4;
    GuitarString guitarString5;
    GuitarString guitarString6;
    guitarStrings = new ArrayList<GuitarString>()

    @Before
    public void before() {
        guitarString1 = new GuitarString("Nylon", "Martin");
        guitarString2 = new GuitarString("Nylon", "Martin");
        guitarString3 = new GuitarString("Nylon", "Martin");
        guitarString4 = new GuitarString("Nylon", "Martin");
        guitarString5 = new GuitarString("Nylon", "Martin");
        guitarString6 = new GuitarString("Nylon", "Martin");
        guitar = new Guitar("wood", "brown", "string", 50, 70, guitarStrings, "Medium");
    }
}
