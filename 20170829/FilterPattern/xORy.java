import java.util.List;


public class xORy implements Kriter {
	
	private Kriter anakriter;
	private Kriter sonrakikriter;
	
	public xORy(Kriter anakriter, Kriter sonrakikriter) {
		this.anakriter = anakriter;
		this.sonrakikriter = sonrakikriter;
	}

	public List<Bilgiler> filterpattern(List<Bilgiler> bilgi) {

		List<Bilgiler> ilkKriterĘcerik = anakriter.filterpattern(bilgi);
		List<Bilgiler> sonrakikriterĘcerik = sonrakikriter.filterpattern(bilgi);
		
		for (Bilgiler bilgiler : sonrakikriterĘcerik) {
			if (!ilkKriterĘcerik.contains(bilgiler)) {
				ilkKriterĘcerik.add(bilgiler);
			}
		}
		return ilkKriterĘcerik;
	}

}




	
	



