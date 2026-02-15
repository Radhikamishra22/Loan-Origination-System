
interface ValidationUtility {
		static boolean isEmpty(String value){
			if(value!=null && value.length()>0){
				return false;
			}
			else
			{
				return true;
			}
		}
	}

