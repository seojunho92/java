package ch07.ex04.case05.presentation;

import ch07.ex04.case05.domain.Score;
import ch07.ex04.case05.service.ScoreService;

public class ScoreIo {
	private ScoreService scoreService;
	
	public ScoreIo(ScoreService scoreService) {
		this.scoreService = scoreService;
	}
	
	public void play() {
		for(int i = 0; i< 5; i++) {
			scoreService.addScore(new Score(Console.inNum("���� ������ �Է��ϼ���."),
					Console.inNum("���� ������ �Է��ϼ���."),
					Console.inNum("���� ������ �Է��ϼ���.")));	
		}
		
		Score[] scores = scoreService.getScores();
		for(Score score: scores)
			System.out.println(score);
	}
}
