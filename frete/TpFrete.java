package frete;

import entrega.Normal;
import entrega.Rapida;

public enum TpFrete {
	
	NORMAL {
		@Override
		public Frete obterFrete() {
			return new Normal();
		}
	},

	RAPIDA {
		@Override
		public Frete obterFrete() {
			return new Rapida();
		}
	};

	public abstract Frete obterFrete();

}
