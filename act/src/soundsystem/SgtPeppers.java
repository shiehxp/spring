package soundsystem;

import org.springframework.stereotype.Component;

@Component  //��������Ϊ����࣬��֪springҪΪ����ഴ��bean
public class SgtPeppers implements CompactDisc{
	private String title="Sgt. Pepper's Lonely Hearts Clb Band";
	private String artist="The Beatles";

	@Override
	public void paly() {
		// TODO Auto-generated method stub
		System.out.println("Playing "+title+"by "+artist);
	}

}
