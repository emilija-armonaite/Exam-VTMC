package lt.vtmc.exam;

import lt.vtmc.exam.test.BaseTest;

public class TestImpl extends BaseTest {

	@Override
	protected TransportManager createTransportManager() {
		TransportManager transportManager = new TransportManagerImpl();
		return transportManager;
	}

}
