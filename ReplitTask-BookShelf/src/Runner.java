public class Runner {
    public static void main(String[] args) {
        var book1 = new Book(44, "shel silverstein" ,"the Giving tRee",532);
        var book2 = new Book(434, "Dan Brown" ,"the da Vinci coDe",1532);
        Shelf.addBook(100,"j.K. rowLing","harry potter",556);
        Shelf.addBook(book1);
        Shelf.addBook(book2);

        System.out.println(Shelf.getTheBooks());
    }
}
