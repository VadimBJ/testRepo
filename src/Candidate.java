public enum Candidate {
  McCain(0), Obama(0);

int votes;

  Candidate(int votes) {
    this.votes = votes;
  }

  public void setVotes(int votes) {
    this.votes = votes;
  }

  public int getVotes() {
    return votes;
  }
}
