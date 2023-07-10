public class Main {
    public static void main(String[] args) {
       Author shattam = new Author("Максим","Шаттам");
        Author barto=new Author("Агния","Барто");
        Book igrirazuma=new Book("Игры разума",shattam,2010);
        Book stihi=new Book("Стихи детские",barto,2020);
        System.out.println("Автор :"+shattam.getNameAuthor()+" "+shattam.getSurnameAuthor());
        System.out.println("Название :"+igrirazuma.nameBook);
        System.out.println("Год выпуска "+igrirazuma.est);
        System.out.println(" ");
        System.out.println("Автор "+barto.getNameAuthor()+" "+barto.getSurnameAuthor());
        System.out.println("Название "+stihi.nameBook);
        System.out.println("Год выпуска "+ stihi.est);
        igrirazuma.setEst(2332);
        System.out.println("Год выпуска "+igrirazuma.est);
        System.out.println(shattam);
     System.out.println(barto);
     System.out.println(igrirazuma);
     System.out.println(stihi);
     System.out.println(shattam.equals(barto));
     System.out.println(barto.hashCode());
     System.out.println(igrirazuma.hashCode());
     System.out.println(stihi.hashCode());
    }
}