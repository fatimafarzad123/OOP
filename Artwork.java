public class Artwork{
		private 	String title;
		private int 	Year;
		private 	Artist artist;
            	public void setYear(int Year){
			this.Year=Year;

						}
		Artwork(){
			title="no title";
			Year= 0;
		        artist="null";



				}
Artwork(String title , int Year, Artist artist){
			this.title="MY ART";
			this.Year= 2220;
		        this.artist=new Artist("James");}

		public int getYear(){
				return Year;
			

					}
		public void settitle(String title){
				this.title=title;

					}
		public String gettitle(){
				return title;
			
						}
		public void setartist( ){
					

					}
		public Artist getartist(){

		}







			}