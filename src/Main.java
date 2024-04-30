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
        Author pushkinAleksandr = new Author(firstNameFirstAuthor, secondNameFirstAuthor);
        System.out.println(pushkinAleksandr.getFirstNameAuthor() + " " + pushkinAleksandr.getSecondNameAuthor());
        Author turgenevIvan = new Author(firstNameSecondAuthor, secondNameSecondAuthor);
        System.out.println(turgenevIvan.getFirstNameAuthor() + " " + turgenevIvan.getSecondNameAuthor());
        Book capitanDochka = new Book(firstBook, firstAuthor, yearFirstBook);
        System.out.println(capitanDochka.getTitleBook() + ", " + capitanDochka.getAuthorBook() + ", " + capitanDochka.getYearBook());
        Book fathersAndChildren = new Book(secondBook, secondAuthor, yearSecondBook);
        System.out.println(fathersAndChildren.getTitleBook() + ", " + fathersAndChildren.getAuthorBook() + ", " + fathersAndChildren.getYearBook());
    }
}