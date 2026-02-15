public class Customer{
	    private String name;
	    private String mobile;
	    private String email;
	    private float loanamount;
	    private static int tenure;
	    private String incomeSource;
	    private int income;// per annum
	    private int assets;
	    private int liability;        
	    private String qualification;
	    private int age;
	    private int experience;
	    private String pancard;
	    private String voterid;
	    private float scoring;
	    private float remainingEmi;
		public float getRemainingEmi() {
			return remainingEmi;
		}
		public void setRemainingEmi(float remainingEmi) {
			this.remainingEmi = remainingEmi;
		}
		public float getEmi() {
			return emi;
		}
		public void setEmi(float emi) {
			this.emi = emi;
		}
		public float loanGranted;
	    public int loanChoice;
	    public float emi;
	    public float amountWithInterest;

		public float getAmountWithInterest() {
			return amountWithInterest;
		}
		public void setAmountWithInterest(float amountWithInterest) {
			this.amountWithInterest = amountWithInterest;
		}
		public float getLoanGranted() {
			return loanGranted;
		}
		public void setLoanGranted(float loanGranted) {
			this.loanGranted = loanGranted;
		}
		public int getLoanChoice() {
			return loanChoice;
		}
		public void setLoanChoice(int loanChoice) {
			this.loanChoice = loanChoice;
		}
		public float getScore() {
			return scoring;
		}
		public void setScore(float Score) {
			this.scoring = Score;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
        }
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public float getLoanAmount() {
			return loanamount;
		}
		public void setLoanAmount(float amount) {
			this.loanamount = amount;
		}
		public static int getTenure() {
			return tenure;
		}
		public static void setTenure(int tenure) {
			Customer.tenure = tenure;
		}

		public String getIncomeSource() {
			return incomeSource;
		}
		public void setIncomeSource(String incomeSource) {
			this.incomeSource = incomeSource;
		}
		public int getIncome() {
			return income;
		}
		public void setIncome(int income) {
			this.income = income;
		}
		public int getAssets() {
			return assets;
		}
		public void setAssets(int assets) {
			this.assets = assets;
		}
		public int getLiability() {
			return liability;
		}
		public void setLiability(int liability) {
			this.liability = liability;
		}
		public String getQualification() {
			return qualification;
		}
		public void setQualification(String qualification) {
			this.qualification = qualification;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getExperience() {
			return experience;
		}
		public void setExperience(int experience) {
			this.experience = experience;
		}
		public String getPancard() {
			return pancard;
		}
		public void setPancard(String pancard) {
			this.pancard = pancard;
		}
		public String getVoterid() {
			return voterid;
		}
		public void setVoterid(String voterid) {
			this.voterid = voterid;
		}
		 


	}
