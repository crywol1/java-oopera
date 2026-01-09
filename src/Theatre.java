import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {

        //Создание актеров
        Actor actor1 = new Actor("Василий", "Федоров", Gender.MALE, 1.78);
        Actor actor2 = new Actor("Петр", "Климов", Gender.MALE, 1.67);
        Actor actor3 = new Actor("Елизавета", "Пискунова", Gender.FEMALE, 1.65);

        //Создание режиссеров
        Director director1 = new Director("Семен", "Пяткин", Gender.MALE, 6);
        Director director2 = new Director("Валентина", "Карпова", Gender.FEMALE, 14);

        //Создание композитора
        Person musicAuthor1 = new Person("Михаил", "Глинка", Gender.MALE);
        Person musicAuthor2 = new Person("Петр", "Чайковский", Gender.MALE);

        //Создание хореографа
        Person choreographer = new Person("Алла", "Духова", Gender.FEMALE);

        //Создаем обычный спектакль
        Show show = new Show("Отцы и Дети", 180, director1,new ArrayList<>());

        //Создаем оперу с пустым списком актеров
        Opera opera = new Opera("Жизнь за царя", 140, director1, new ArrayList<Actor>(), musicAuthor1, "Либретто 1", 25);

        //Создаем балет с пустым списком актеров
        Ballet ballet = new Ballet("Щелкунчик", 120, director2, new ArrayList<>(), musicAuthor2, "Либретто 2", choreographer);

        //Добавление актеров в обычный спектакль
        show.addActorToList(actor1);
        show.addActorToList(actor2);
        show.addActorToList(actor3);
        System.out.println("Список актеров в спектакле '" + show.getTitle() + "'");
        show.printActors();

        //добавление актеров в оперу
        opera.addActorToList(actor1);
        System.out.println("\nСписок актеров в опере '" + opera.getTitle() + "'");
        opera.printActors();

        //добавление актеров в балет
        ballet.addActorToList(actor3);
        ballet.addActorToList(actor2);
        System.out.println("\nСписок актеров в балете '" + ballet.getTitle() + "'");
        ballet.printActors();

        //замена актера
        ballet.replaceActorInList(actor3, actor1);
        System.out.println("Обновленный список актеров в балете '" + ballet.getTitle() + "'");
        ballet.printActors();

        //замена актера (несуществующего)
        opera.replaceActorInList(actor2, actor3);

        //печать либретто
        System.out.println("\nЛибретто оперы '" + opera.getTitle() + "':");
        opera.printLibretto();

        System.out.println("\nЛибретто балета '" + ballet.getTitle() + "':");
        ballet.printLibretto();

        System.out.println("\nРепертуар театра:");
        System.out.println(opera);
        System.out.println(ballet);
        System.out.println(show);
    }
}
