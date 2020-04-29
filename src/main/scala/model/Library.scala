package model

import scala.collection.mutable

object Library {

  // Create a HashMap object to act as the in-memory database
  val bookList: mutable.HashMap[String,Book] = mutable.HashMap.empty

  // Adding Some Default Values to the bookList
  bookList.put("9781449340292",Book("9781449340292","scala cook book", "alvin alexander"))
  bookList.put("9780545010221",Book("9780545010221","harry potter and the deathly hallows", "j k rowling"))
  bookList.put("9781455525256",Book("9781455525256","gordon ramsay's home cooking", "gordon ramsay"))

  // TODO Reformat The Functions
  //addBook function insert a new Book Object to the Hashmap
  def addBook(isbn: String, book: Book): Option[Book] ={
    bookList.put(isbn, book)
  }

  //getBook function returns all the book objects
  def getBook(isbn: String): Option[Book] = bookList.get(isbn)

  //getBook function returns all the book objects
  def getAllBooks: List[Book] = bookList.values.toList

  //searchBook function returns all the book objects which contains the search query in author or book title
  def searchBook(query_param: String): List[Book] = {

    val searchListTitle = bookList.values.filter(_.title.contains(query_param)).toList
    val searchListAuthor = bookList.values.filter(_.author.contains(query_param)).toList

    if (searchListTitle.nonEmpty && searchListAuthor.nonEmpty){
      return searchListTitle ++ searchListAuthor
    } else if (searchListTitle.isEmpty && searchListAuthor.nonEmpty) {
      return searchListAuthor
    }
    searchListTitle
  }
}

