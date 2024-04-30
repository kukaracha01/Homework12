public class Main {
    public static void main(String[] args) {
        String firstBook = "Капитанская дочка";
        String secondBook = "Отцы и дети";
        String firstAuthor = "А.Пушкин";
        String secondAuthor = "И.Тургенев";
        int yearFirstBook = 1836;
        int yearSecondBook = 1860;
        String firstNameFirstAuthor = "Александр";
        String secondNameFirstAuthor = "Пушкин";
        String firstNameSecondAuthor = "Иван";
        String secondNameSecondAuthor = "Тургенев";
        Book capitanDochka = new Book(firstBook, firstAuthor, yearFirstBook);
        Author pushkinAleksandr = new Author(firstNameFirstAuthor, secondNameFirstAuthor);
        Book fathersAndChildren = new Book(secondBook, secondAuthor, yearSecondBook);
        Author turgenevIvan = new Author(firstNameSecondAuthor, secondNameSecondAuthor);

    }
}