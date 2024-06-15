import java.util.ArrayList;

public class BookManager {
	public class Book {
		public int id;
		public String title;
		public String author;
		public int year;

		public Book(int ID, String Title, String Author, int Year) {
			super();
			this.id = ID;
			this.title = Title;
			this.author = Author;
			this.year = Year;
		}
		
		public void printBookInfo() {	// id로 library의 Book 정보 출력
			System.out.println("Book{id: '" + id + "', 제목: '" + title + "', 저자: '" + author + "', 출판년도: " + year + "}");
		}
	}

	Book[] library = new Book[10];	// Book 객체 배열

	public void addBook(int ID, String Title, String Author, int Year) {
		// library에 해당 id의 Book 객체 이미 있으면 안내
		if (library[ID] != null) {		  
			System.out.println("해당 ID(" + ID + ")는 이미 존재합니다.");
		}
		// library에 해당 id의 Book 객체 없으면 추가
		else {		
			library[ID] = new Book(ID, Title, Author, Year);
			library[ID].printBookInfo();
			System.out.println("도서가 추가되었습니다.");
		}		
	}

	public void searchBook(int ID) {	
		// 해당 Book 객체가 없거나 Book이 삭제된 경우
		if (library[ID] == null || library[ID].id == 0) {	
			System.out.println("검색된 도서가 없습니다.");
		}
		// 해당 Book이 있으면 검색결과 표시
		else {	
			System.out.println("검색결과:");
			library[ID].printBookInfo();	
		}
	}

	public void deleteBook(int ID) {
		// 해당 id의 Book 객체가 없거나 이미 삭제된 경우 안내
		if (library[ID] == null || library[ID].id == 0) {	
			System.out.println("해당 ID(" + ID + ")의 도서를 찾을 수 없습니다.");
		}
		// 해당 Book 있으면 삭제
		else {	
			library[ID].printBookInfo();
			System.out.println("도서를 삭제하였습니다.");
			library[ID].id = 0;
		}
	}
}
