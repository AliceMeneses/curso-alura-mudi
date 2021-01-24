package br.com.alura.mvc.mudi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		List<Pedido> pedidos = new ArrayList<>();
		
		Pedido pedido = new Pedido();
		
		pedido.setNomeProduto("Kindle Paperwhite");
		pedido.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/61ldUg%2BPqQL._AC_SL1000_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/dp/B0773XBMB6/ref=s9_acsd_al_bw_c2_x_2_t?pf_rd_m=A3RN7G7QC5MWSZ&pf_rd_s=merchandised-search-4&pf_rd_r=MR24ERPW68CMSP1Z3YP0&pf_rd_t=101&pf_rd_p=ba210773-a620-40de-95b6-13fca05b991b&pf_rd_i=17387223011");
		pedido.setDescricao("O mais leve e fino Kindle Paperwhite já lançado. Com a tela antirreflexo "
				+ "de 300 ppi, você pode ler como se fosse em papel, mesmo sob a luz do sol.");
				
		pedidos.add(pedido);
		
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
}
