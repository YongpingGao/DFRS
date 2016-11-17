package dfrs.replicamanager;

public class ReplicaManager3 extends BaseRM {
	public static final String RM_HOST = "localhost";
	
	public static final int RM_RECEIVE_FE_PROT = 7003;
	public static final int RM_RECEIVE_SEQUENCER_PROT = 7103;
	public static final int RM_RECEIVE_RM_PROT = 7203;
	//HEARTBEAT
	public static final int RM_RECEIVE_HEARTBEAT_PROT = 7230;
	
	@Override
	protected int getFEport() {
		// TODO Auto-generated method stub
		return RM_RECEIVE_FE_PROT;
	}

	@Override
	protected int getSEport() {
		// TODO Auto-generated method stub
		return RM_RECEIVE_SEQUENCER_PROT;
	}
	
	@Override
	protected int getRMport() {
		// TODO Auto-generated method stub
		return RM_RECEIVE_RM_PROT;
	}

	@Override
	protected int getHBport() {
		// TODO Auto-generated method stub
		return RM_RECEIVE_HEARTBEAT_PROT;
	}

	@Override
	protected String getHost() {
		// TODO Auto-generated method stub
		return RM_HOST;
	}

	@Override
	protected int getS2FEport() {
		// TODO Auto-generated method stub
		return 0;
	}
}