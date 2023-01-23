package kz.bitlab.javaee.db;

import com.sun.tools.javac.Main;

import java.util.ArrayList;

public class DBManager {

    private static final ArrayList<Task> Main_TASKS = new ArrayList<>();
    private static Long t_id = 3L;

    static {
        Main_TASKS.add(new Task(01L, "JAVA EE page creation", "Download Compressor " +
                "and just set up the " +
                "JAVA EE APP", "24/01/2023", "Yes"));
        Main_TASKS.add(new Task(02L, "Clean the home", "Buy cleaning liquids  ",
                "01/02/2023", "Yes"));
    }

    public static void addTask(Task task) {
        task.setId(t_id);
        Main_TASKS.add(task);
        t_id++;
    } //этот метод добавляет новую задачу в список

    public static Task getTask(Long id) {
        //Long iddd = null; решенине мое
        //String taskobj=null; решение мое
        return Main_TASKS.stream().filter(task -> id == task.getId()).findFirst().orElse(null);
        //for (Task task : Main_TASKS) { решенеие кассика
        //if (id == task.getId())  return task; решение классик
        //iddd = task.getId(); // этот метод возвращает объект задачи по id мое
        //taskobj = task.getId() + task.getName() + task.getDescription() + task.getDeadLineDate(); мое решение

    }

    public static ArrayList getAllTasks() {

        return Main_TASKS;
    }//этот метод возвращает список всех задач

    public static void deleteTask(int id) {
        Main_TASKS.remove(id - 1);
    } //этот метод удаляет задачу из списка по id

    public static void updateTask(Long id, String name, String decsription, String deadline,String CComplete) {
        for (Task task : Main_TASKS) {
            if (task.getId() == (Long) id) {
                task.setName(name);
                task.setDescription(decsription);
                task.setDeadLineDate(deadline);
                task.setCompletness(CComplete);
            }
        }
    }


    private static final ArrayList<Footballer> footballers = new ArrayList<>();

    static {
        footballers.add(new Footballer(01L, "Iliyas", "Zhuanyshev", 230000, "MU",
                1000000));
        footballers.add(new Footballer(02L, "B", "BB", 50000, "Spurs",
                2000000));
        footballers.add(new Footballer(03L, "C", "CC", 60000, "MCity",
                3000000));
        footballers.add(new Footballer(04L, "D", "DD", 100000, "Arsenal",
                4000000));
        footballers.add(new Footballer(05L, "E", "EE", 200000, "Chelsea",
                5000000));
        footballers.add(new Footballer(06L, "F", "FF", 500000, "Liverpool",
                6000000));

    }

    public static void addFootballer(Footballer footballer) {
        footballers.add(footballer);
    }

    public static ArrayList<Footballer> getFootballers() {

        return footballers;
    }

    private static final ArrayList<Item> tasks = new ArrayList<>();

    static {
        tasks.add(new Item(01L, "Iphone 13 Pro Max", 450000, 10));
        tasks.add(new Item(02L, "XIAOMi REDMi NOTE 8", 82000, 20));
        tasks.add(new Item(03L, "OPPO 3 Model X", 350000, 15));
        tasks.add(new Item(04L, "MacBook PRo M1 13", 750000, 15));
        tasks.add(new Item(05L, "ASUS TUF Gaming", 340000, 7));


    }

    public static void addItem(Item item) {
        tasks.add(item);
    }

    public static ArrayList<Item> getItems() {
        return tasks;
    }
}
