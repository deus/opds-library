package org.highscreen.library.adapters;

import java.util.List;
import java.util.Map;

import org.highscreen.library.datamodel.Author;
import org.highscreen.library.datamodel.Book;
import org.highscreen.library.datamodel.Tag;

public interface LibraryAdapter {
    public List<Book> getListOfBooks();

    public List<Author> getListOfAuthors();

    public List<Tag> getListOfTags();

    public boolean isUpdateNeeded();

    public Map<Author, List<Book>> getMapOfBooksByAuthor();

    public Map<Tag, List<Book>> getMapOfBooksByTag();
}
