package entity;
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sachintha
 */

public class Accounts implements Serializable
{
  private final int accoutNumber;
  private final String amout;
  //private Member borrower;
  private final String ISBN;
  private final String author;

  //private static final int bookCount=0;
      
  public Accounts(String aName,int bookCount,String aISBN,String aAuthor)
  {    
        super();
        ISBN=aISBN;
        author=aAuthor;
        title1=aName;
        accessionNumber=++bookCount;
        //borrower=null;
  }

  public String getTitle() 
  {
    return title1;
  }
  
  public String getAuthor() 
  {
    return author;
  }  
  
  public int getAccessionNumber() 
  {
    return accessionNumber;
  }
  
   public String getISBN() 
  {
    return ISBN;
  }
  
 /* public void setBorrower(Member theBorrower) 
  {
    borrower=theBorrower;
  }
  
   public void removeBorrower() 
  {
    borrower=null;
  }


  public Member getBorrower() 
  {
    return borrower;
  }
  
   public String getBorrowerName() 
  {
    return borrower.getName();
  }
  
    public Boolean IsAvailable() 
  {
      return borrower == null;
  }
  
  public String toString()
  {
    return Integer.toString(accessionNumber);        
  }
  
 
 
 */
  
}


