/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.bakingpie.client.scenario.book;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Book {
    @XmlElement
    private Integer id;
    @XmlElement
    private String author;
    @XmlElement
    private String title;
    @XmlElement
    private int year;
    @XmlElement
    private String genre;
    @XmlElement
    private String isbn;

    public Book() {
    }

    public Book(final String author, final String title, final int year, final String genre, final String isbn) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.isbn = isbn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(final String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(final int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(final String genre) {
        this.genre = genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(final String isbn) {
        this.isbn = isbn;
    }

    @Override public String toString() {
        return "Book{" +
               "id=" + id +
               ", author='" + author + '\'' +
               ", title='" + title + '\'' +
               ", year=" + year +
               ", genre='" + genre + '\'' +
               ", isbn='" + isbn + '\'' +
               '}';
    }
}
