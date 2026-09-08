

public class Main {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();

        ComputerObjectBuilder objBuilder = new ComputerObjectBuilder();
        director.makeGamingPC(objBuilder);
        Computer gamingPc = objBuilder.getResult();     // representation 1: object

        SpecSheetBuilder sheetBuilder = new SpecSheetBuilder();
        director.makeGamingPC(sheetBuilder);
        String specSheet = sheetBuilder.getResult();    // representation 2: text
        System.out.println(specSheet);
    }
}