package Exception;


	import org.slf4j.Logger;
	import org.slf4j.LoggerFactory;

	public class UserNotFoundException extends RuntimeException {

		private static final long serialVersionUID = 1L;
		Logger LOG = LoggerFactory.getLogger(this.getClass());

		public UserNotFoundException() {
			super();
		}

		public UserNotFoundException(String message) {
			super(message);
			LOG.info(message);
		}
	}

	 


