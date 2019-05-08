package design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: CourseCatelog
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/8
 */

public class CourseCatelog extends CatelogComponent {
	private List<CatelogComponent> items = new ArrayList<>();
	private String name;
	private Integer level;

	public CourseCatelog(String name, Integer level) {
		this.name = name;
		this.level = level;
	}

	@Override
	public void add(CatelogComponent catelogComponent) {
		items.add(catelogComponent);
	}

	@Override
	public String getName(CatelogComponent catelogComponent) {
		return this.name;
	}

	@Override
	public void remove(CatelogComponent catelogComponent) {
		items.remove(catelogComponent);
	}

	@Override
	public void print() {
		System.out.println(this.name);
		for (CatelogComponent catelogComponent : items) {
			if (this.level != null) {
				for (int i = 0; i < this.level; i++) {
					System.out.print("  ");
				}
			}
			catelogComponent.print();

		}

	}
}
