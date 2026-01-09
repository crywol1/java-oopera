import java.util.ArrayList;

public class Show {

    private String title;
    private int duration;
    private Director director;
    protected ArrayList<Actor> listOfActors;


    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void addActorToList(Actor actor) {
        ArrayList<Actor> list = getListOfActors();
        if (list.contains(actor)) {
            System.out.println("Актер уже в списке");
        } else {
            list.add(actor);
            setListOfActors(list);
        }
    }

    public void replaceActorInList(Actor actor1, Actor actor2) {
        ArrayList<Actor> list = getListOfActors();
        if (!list.contains(actor1)) {
            System.out.println("\nТакой актер в спектакле '" + getTitle() + "' не играет. Замена не произведена");
        } else {
            list.remove(actor1);
            list.add(actor2);
            setListOfActors(list);
            System.out.println("\nПроизведена замена актера в представлении");
        }
    }

    public void printActors() {
        ArrayList<Actor> list = getListOfActors();
        System.out.println(list);
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(ArrayList<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Название '" + title + '\'' +
                ", Продолжительность: " + duration + "м" +
                "; Режиссер: " + director +
                "Список актеров " + listOfActors;
    }
}