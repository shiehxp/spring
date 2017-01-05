package soundsystem;

import org.springframework.stereotype.Component;

@Component  //表名会作为组件类，告知spring要为这个类创建bean
public class SgtPeppers implements CompactDisc{
	private String title="Sgt. Pepper's Lonely Hearts Clb Band";
	private String artist="The Beatles";

	@Override
	public void paly() {
		// TODO Auto-generated method stub
		System.out.println("Playing "+title+"by "+artist);
	}

}
