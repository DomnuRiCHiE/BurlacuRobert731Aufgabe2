import Controller.MedikamenteController;
import Controller.PatientenController;
import Repository.MedikamenteRepository;
import Repository.PatientenRepository;
import UI.UI;

public class Main {
    public static void main(String[] args) {
        MedikamenteRepository medikamenteRepository = new MedikamenteRepository();
        PatientenRepository patientenRepository = new PatientenRepository();
        MedikamenteController medikamenteController = new MedikamenteController(medikamenteRepository);
        PatientenController patientenController = new PatientenController(patientenRepository);
        UI ui = new UI(medikamenteController, patientenController);
        ui.menu();
    }
}
