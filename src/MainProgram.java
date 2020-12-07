
public class MainProgram {
    public static void main(String[] args) {
        StringList stringList = new StringList("ASDSASAD ASD DSADAS DASD DASDASDASD SADADASDA");
        stringList.print();
        stringList.add("asdasdd");
        stringList.add("asdasdd");
        stringList.add("asdasdd");
        stringList.add("asdasdd");
        stringList.add("asdasdd");
        stringList.add("asdasdd");
        stringList.add("VSTAVKA",2);
        stringList.print();
        stringList.remove("VSTAVKA");
        stringList.print();
        stringList.remove(6);
        stringList.print();
        stringList.get(6);

    }
}
