package co.edu.collect.board;
/*
 * 글제목, 작성자, 내용.
 */
public class Board {
	private String titile;
	private String writer;
	private String content;
	
	public Board(String titile, String  writer, String content) {
		this.titile = titile;
		this.writer = writer;
		this.content = content;
		
	}

	public String getTitile() {
		return titile;
	}

	public void setTitile(String titile) {
		this.titile = titile;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	
}
		
		
		
	
