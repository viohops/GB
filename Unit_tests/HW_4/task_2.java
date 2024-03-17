
// Интерфейс для доступа к данным о книгах
public interface BookRepository {
    Book getBookById(Long id);
    List<Book> getAllBooks();
    void saveBook(Book book);
}

// Класс, представляющий книгу
public class Book {
    private Long id;
    private String title;
    private String author;

    // Конструктор, геттеры и сеттеры
}



import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import java.util.ArrayList;
import java.util.List;

public class BookServiceTest {

    private BookService bookService;
    private BookRepository bookRepository;

    @Before
    public void setUp() {
        // Создаем мок-объект BookRepository
        bookRepository = mock(BookRepository.class);
        bookService = new BookService(bookRepository); // Передаем мок-объект в конструктор BookService
    }

    @Test
    public void testGetBookById() {
        // Создаем фиктивную книгу
        Book mockBook = new Book(1L, "Тестовая книга", "Автор");

        // Когда вызываем bookRepository.getBookById(1L), вернуть фиктивную книгу
        when(bookRepository.getBookById(1L)).thenReturn(mockBook);

        // Вызываем метод, который мы хотим протестировать
        Book result = bookService.getBookById(1L);

        // Проверяем, что результат соответствует ожиданиям
        assertEquals("Тестовая книга", result.getTitle());
        assertEquals("Автор", result.getAuthor());

        // Проверяем, что метод bookRepository.getBookById был вызван с аргументом 1L
        verify(bookRepository, times(1)).getBookById(1L);
    }

    @Test
    public void testGetAllBooks() {
        // Создаем фиктивные книги
        List<Book> mockBooks = new ArrayList<>();
        mockBooks.add(new Book(1L, "Книга 1", "Автор 1"));
        mockBooks.add(new Book(2L, "Книга 2", "Автор 2"));

        // Когда вызываем bookRepository.getAllBooks(), вернуть фиктивный список книг
        when(bookRepository.getAllBooks()).thenReturn(mockBooks);

        // Вызываем метод, который мы хотим протестировать
        List<Book> result = bookService.getAllBooks();

        // Проверяем, что результат соответствует ожиданиям
        assertEquals(2, result.size());

        // Проверяем, что метод bookRepository.getAllBooks был вызван
        verify(bookRepository, times(1)).getAllBooks();
    }

    @Test
    public void testSaveBook() {
        // Создаем фиктивную книгу
        Book bookToSave = new Book(3L, "Новая книга", "Автор 3");

        // Вызываем метод, который мы хотим протестировать
        bookService.saveBook(bookToSave);

        // Проверяем, что метод bookRepository.saveBook был вызван с переданной книгой
        verify(bookRepository, times(1)).saveBook(bookToSave);
    }
}
