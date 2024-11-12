package de.unistuttgart.iste.sqa.pse.sheet12.homework.hamsterclub;

import java.util.List;

/**
 * A club of hamsters.
 */
public final class HamsterClub implements Club {

	private final List<ClubMember> members;

	/**
	 * Create a new {@code HamsterClub}.
	 *
	 * @param members members of the club. Must not be null.
	 * @throws IllegalArgumentException if members is null.
	 */
	public HamsterClub(final List<ClubMember> members) throws IllegalArgumentException {
		if (members == null) {
			throw new IllegalArgumentException();
		}
		this.members = members;
	}
	
	@Override
	public List<ClubMember> getMembersWithUnpaidFees() {
		// TODO: implement (a)
		return null;
	}

	@Override
	public List<String> getNameOfMembers() {
		// TODO: implement (b)
		return null;
	}

	@Override
	public double getTotalContributions() {
		// TODO: implement (c)
		return 0.0;
	}

	@Override
	public void applyDiscount() {
		// TODO: implement (d)
	}

	@Override
	public ClubMember getOldestMember() {
		// TODO: implement (e)
		return null;
	}

	@Override
	public List<ClubMember> getMembers() {
		return members;
	}
}
