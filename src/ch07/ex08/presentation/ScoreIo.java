package ch07.ex08.presentation;

import java.util.List;

import ch07.ex08.domain.Score;
import ch07.ex08.service.ScoreService;

public class ScoreIo {
	private ScoreService scoreService;
	
	public ScoreIo(ScoreService scoreService) {
		this.scoreService = scoreService;
	}
	
	public void play() {
		int korScore = 0;
		int engScore = 0;
		int mathScore = 0;
		
		for(int i = 0; i < 3; i++) {
			korScore = Console.inNum("국어점수를 입력하세요.");
			engScore = Console.inNum("영어점수를 입력하세요.");
			mathScore = Console.inNum("수학점수를 입력하세요.");
			
			Score socre = new Score(korScore, engScore, mathScore);
			scoreService.addScore(socre);
		}
		
		List<Score> scores = scoreService.getScores();
		for(Score score: scores)
			System.out.println(score);
	}
}
