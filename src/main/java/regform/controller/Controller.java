package regform.controller;

import regform.model.Model;
import regform.model.entity.NotUniqueLoginException;
import regform.model.entity.NoteBook;
import regform.view.View;

import java.util.Scanner;

/**
 * class Controller gets data from console line and validates it.
 * Controller uses Model for business logic
 * and View in order to output validation info
 * @author Andrii Barsuk
 * @see Model
 * @see View
 */
public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        InputNoteNoteBook inputNoteNotebook = new InputNoteNoteBook(view, sc);
        inputNoteNotebook.inputNote();

        NoteBook noteBook = getNoteBook(inputNoteNotebook);
        System.out.println(noteBook);
    }

    private NoteBook getNoteBook(InputNoteNoteBook inputNoteNotebook) {
        NoteBook noteBook = null;
        while (true) {
//            try {
                noteBook = new NoteBook(inputNoteNotebook.getFirstName(),
                        inputNoteNotebook.getLoginData());
                break;
//            } catch (NotUniqueLoginException e) {
//                e.printStackTrace();
//                System.out.println("Not Unique Login " + e.getLoginData());
//                inputNoteNotebook.inputLogin();
//            }
        }
        return noteBook;
    }
}
