import java.util.HashMap;

class Person {

	// arkiv inneholder personens eide DVDer.
	// laante inneholder hvilke DVDer personen laaner.
	// utlaante inneholder hvilke DVDer personen laaner bort
	Map<String, DVD> arkiv = new HashMap<String, DVD> ();
	Map<String, DVD> laante = new HashMap<String, DVD> ();
	Map<String, DVD> utlaante = new HashMap<String, DVD> ();
}