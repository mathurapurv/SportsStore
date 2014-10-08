package com.sportsstore;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SportsStoreServlet
 */
public class SportsStoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SportsStoreServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("[{\"category\":\"Watersports\",\"description\":\"A boat for one person\",\"name\":\"Kayak\", \"price\":275,\"id\":\"05af70919155f8fc\"}, {\"category\":\"Watersports\", \"description\":\"Protective and fashionable\", \"name\":\"Lifejacket\",\"price\":48.95,\"id\":\"3d31d81b218c98ef\"}, {\"category\":\"Soccer\",\"description\":\"FIFA-approved size and weight\", \"name\":\"Soccer Ball\",\"price\":19.5,\"id\":\"437615faf1d38815\"}, {\"category\":\"Soccer\",\"description\":\"Give your playing field a professional touch\", \"name\":\"Corner Flags\",\"price\":34.95,\"id\":\"93c9cc08ac2f28d4\"}, {\"category\":\"Soccer\",\"description\":\"Flat-packed 35,000-seat stadium\", \"name\":\"Stadium\",\"price\":79500,\"id\":\"ad4e64b38baa088f\"}, {\"category\":\"Chess\",\"description\":\"Improve your brain efficiency by 75%\", \"name\":\"Thinking Cap\",\"price\":16,\"id\":\"b9e8e55c1ecc0b63\"}, {\"category\":\"Chess\",\"description\":\"Secretly give your opponent a disadvantage\", \"name\":\"Unsteady Chair\",\"price\":29.95,\"id\":\"32c2355f9a617bbd\"}, {\"category\":\"Chess\",\"description\":\"A fun game for the family\", \"name\":\"Human Chess Board\",\"price\":75,\"id\":\"5241512218f73a26\"}, {\"category\":\"Chess\",\"description\":\"Gold-plated, diamond-studded King\", \"name\":\"Bling-Bling King\",\"price\":1200,\"id\":\"59166228d70f8858\"}]");
	}

}
