package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.template.dto.BuyItemDTO;
import com.internousdev.template.util.DBConnector;

public class BuyItemDAO {
	public BuyItemDTO getBuyItemInfo() {
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		BuyItemDTO buyItemDTO=new BuyItemDTO();//DTOクラスで作ったBuyItemDTOインスタンスをDAOクラスで作る。この時buyItemDTOはDAOクラス内のBuyItemDTOオブジェクト。
		
		String sql="SELECT id, item_name, item_price FROM item_info_transaction";
		
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();//リザルトセットにid,item_name,item_priceを代入
			if(rs.next())/*リザルトセットのネクストメソッドを実行。引数はない。ネクストメソッドをコーディングして定義したわけではない。
				インポートによって元々備わっているものを使う。ネクストメソッドの戻り値はtrue or false。
				リザルトセットの２行目に値が入っていればtrue、入っていなければfalseとなる。*/
				{
				buyItemDTO.setId(rs.getInt("id"));//リザルトセットに入っているidという値をDAOクラスのオブジェクトであるbuyItemDTOに代入。
				buyItemDTO.setItemName(rs.getString("item_name"));
				buyItemDTO.setItemPrice(rs.getString("item_price"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}return buyItemDTO;
	}

}
