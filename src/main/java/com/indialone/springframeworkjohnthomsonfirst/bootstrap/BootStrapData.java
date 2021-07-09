package com.indialone.springframeworkjohnthomsonfirst.bootstrap;

import com.indialone.springframeworkjohnthomsonfirst.domain.Author;
import com.indialone.springframeworkjohnthomsonfirst.domain.Book;
import com.indialone.springframeworkjohnthomsonfirst.domain.Publisher;
import com.indialone.springframeworkjohnthomsonfirst.repositories.AuthorRepository;
import com.indialone.springframeworkjohnthomsonfirst.repositories.BookRepository;
import com.indialone.springframeworkjohnthomsonfirst.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {


    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(BookRepository bookRepository, AuthorRepository authorRepository, PublisherRepository publisherRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author arthurCanonDoyle = new Author("Arthur Canon", "Doyle");
        Book sh = new Book("The Hound of BaskerVille", "123456");

        Publisher indiePublisher = new Publisher();
        indiePublisher.setName("Indie Publishers");
        indiePublisher.setAddressLine1("Prajapati Vas, Near GramPanchayat");
        indiePublisher.setCity("Village : Mahor");
        indiePublisher.setState("Gujarat");
        indiePublisher.setZip("384330");
        indiePublisher.getBooks().add(sh);

        arthurCanonDoyle.getBooks().add(sh);
        sh.getAuthors().add(arthurCanonDoyle);

        authorRepository.save(arthurCanonDoyle);
        bookRepository.save(sh);
        publisherRepository.save(indiePublisher);

        Author agathaChristie = new Author("Agatha", "Christie");
        Book silenceOfTheLambs = new Book("SilenceOfTheLambs", "123456");

        Publisher alonePublisher = new Publisher();
        alonePublisher.setName("Alone Publishers");
        alonePublisher.setAddressLine1("49 Rajendra Colony, Near Adarsha Vidhyalaya");
        alonePublisher.setCity("Visnagar");
        alonePublisher.setState("Gujarat");
        alonePublisher.setZip("384315");
        alonePublisher.getBooks().add(silenceOfTheLambs);

        agathaChristie.getBooks().add(silenceOfTheLambs);
        silenceOfTheLambs.getAuthors().add(agathaChristie);

        authorRepository.save(agathaChristie);
        bookRepository.save(silenceOfTheLambs);
        publisherRepository.save(alonePublisher);


        System.out.println("Book Repository: " + bookRepository.count());
        System.out.println("Author Repository: " + authorRepository.count());
        System.out.println("PUblisher Repository: " + publisherRepository.count());


    }
}
