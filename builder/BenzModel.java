package builder;

public class BenzModel extends CarModel {
	 
	@Override
	protected void start() {
		System.out.println("±¼³ÛÆô¶¯¡­¡­");
	}
 
	@Override
	protected void stop() {
		System.out.println("±¼³ÛÍ£Ö¹¡­¡­");
	}
 
	@Override
	protected void alarm() {
		System.out.println("±¼³ÛÃùµÑ¡­¡­");
	}
 
	@Override
	protected void engineBoom() {
		System.out.println("±¼³ÛºäÃù");
	}
 
}
//±¦Âí¾ÍÂÔÁË¡­¡­Ò»ÑùµÄ