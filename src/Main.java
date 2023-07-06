public class Main {
    public static void main(String[] args) {
       Author shattam = new Author("Максим","Шаттам");
        Author barto=new Author("Агния","Барто");
        Book igrirazuma=new Book("Игры разума","Максим Шаттам",2010);
        Book stihi=new Book("Стихи детские","Агния Барто",2020);
        System.out.println("Автор :"+shattam.getNameAuthor()+" "+shattam.getSurnameAuthor());
        System.out.println("Название :"+igrirazuma.nameBook);
        System.out.println("Год выпуска "+igrirazuma.est);
        System.out.println(" ");
        System.out.println("Автор "+barto.getNameAuthor()+" "+barto.getSurnameAuthor());
        System.out.println("Название "+stihi.nameBook);
        System.out.println("Год выпуска "+ stihi.est);
        igrirazuma.setEst(2332);
        System.out.println("Год выпуска "+igrirazuma.est);

    }
}