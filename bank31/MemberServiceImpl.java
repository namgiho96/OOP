package bank31;

import bank.Member;

public class MemberServiceImpl implements MemberService {

	private MemberBaen[] members;
	private int count;
	MemberBaen member = new MemberBaen();
	
		MemberServiceImpl(){
			this.members = new MemberBaen[10];
			this.count = 0;
			}
		
		@Override
		public void join(String id,
			String name,
			String ssn,
			String pass) {
			member.setId(id);
			member.setName(name);
			member.setSsn(ssn);
			member.setPass(pass);
			members[count] = member;
			count++;
		}
		@Override
		public MemberBaen[] list() {
		return members;
		}
		@Override
		public MemberBaen find(String id) {
			member = new MemberBaen();
			for(int i =1;i<count;i++) {
				if(members[i].getId().equals(id)) {
					member =  members[i];
					break;
				}else {
				}
			}
		return member;
		}
		@Override
		public boolean login(String id, String pw) {
			boolean ok = false;
			for(int i =1;i<count;i++) {
				if(members[i].getId().equals(id)
						&&members[i].getPass().equals(pw)) {
					ok = true;
					break;
				}else {
					
				}
			
			}
			return ok;
		}
		@Override
		public int count() {
		return count;
		}
		@Override
		public void update(String pass,String id,String newpw) {
			for(int i =0; i<count; i++) {
				if(members[i].getId().equals(id)
						&& members[i].getPass().equals(pass)) {
					  members[i].setPass(newpw);
					break;
				}
			}
		}
		@Override
		public void delete() {
			
		}
}
