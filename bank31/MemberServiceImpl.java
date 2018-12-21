package bank31;

public class MemberServiceImpl implements MemberService {

	@Override
	public MemberBaen join(String id,
			String name,
			String ssn,
			String pass) {
		MemberBaen member = new MemberBaen(id, name, ssn, pass);
		member.getId();
		member.getName();
		member.getSsn();
		member.getPass();
		return member;
	}

	@Override
	public MemberBaen login(String id,String pass) {
	
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	

}
