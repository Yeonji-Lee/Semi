package ncs.kh.DTO;

public class UfileDTO {
	
	private int seq;
	private String serverFileName;
	private String oriFileName;
	private String filePath;
	private long fileSize;
	
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getServerFileName() {
		return serverFileName;
	}
	public void setServerFileName(String serverFileName) {
		this.serverFileName = serverFileName;
	}
	public String getOriFileName() {
		return oriFileName;
	}
	public void setOriFileName(String oriFileName) {
		this.oriFileName = oriFileName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public long getFileSize() {
		return fileSize;
	}
	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}
	public UfileDTO(int seq, String serverFileName, String oriFileName, String filePath, long fileSize) {
		this.seq = seq;
		this.serverFileName = serverFileName;
		this.oriFileName = oriFileName;
		this.filePath = filePath;
		this.fileSize = fileSize;
	}
	public UfileDTO() {
		super();
	}
	
	

}
