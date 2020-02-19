package lotto.domain;

import java.util.List;

public class Lottos {
	private final List<Lotto> lottos;

	public Lottos(final List<Lotto> lottos) {
		validateNullAndEmpty(lottos);
		this.lottos = lottos;
	}

	private void validateNullAndEmpty(List<Lotto> lottos) {
		if (lottos == null || lottos.isEmpty()) {
			throw new IllegalArgumentException("null이나 빈 값이 들어올 수 없습니다.");
		}
	}
}
